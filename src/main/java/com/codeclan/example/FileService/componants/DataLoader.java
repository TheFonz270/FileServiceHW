package com.codeclan.example.FileService.componants;

import com.codeclan.example.FileService.models.File;
import com.codeclan.example.FileService.models.Folder;
import com.codeclan.example.FileService.models.User;
import com.codeclan.example.FileService.repositories.FileRepository;
import com.codeclan.example.FileService.repositories.FolderRepository;
import com.codeclan.example.FileService.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

    User jack = new User("Jack");
    User will = new User("Will");
    userRepository.save(jack);
    userRepository.save(will);

    Folder coins = new Folder("coins", jack);
    Folder hammers = new Folder("hammers", will);
    folderRepository.save(coins);
    folderRepository.save(hammers);

    File goldCoin = new File("goldCoin", "txt", 10, coins);
    File silverCoin = new File("silverCoin", "txt", 5, coins);
    File bronzeCoin = new File("bronzeCoin", "txt", 2, coins);
    fileRepository.save(goldCoin);
    fileRepository.save(silverCoin);
    fileRepository.save(bronzeCoin);

    File sledge = new File("sledge", "txt", 10, hammers);
    File iron = new File("iron", "txt", 5, hammers);
    fileRepository.save(sledge);
    fileRepository.save(iron);

    folderRepository.save(coins);
    folderRepository.save(hammers);

    }
}
