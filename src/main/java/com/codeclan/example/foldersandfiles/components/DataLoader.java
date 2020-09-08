package com.codeclan.example.foldersandfiles.components;

import com.codeclan.example.foldersandfiles.models.File;
import com.codeclan.example.foldersandfiles.models.Folder;
import com.codeclan.example.foldersandfiles.models.User;
import com.codeclan.example.foldersandfiles.repositories.FileRepository;
import com.codeclan.example.foldersandfiles.repositories.FolderRepository;
import com.codeclan.example.foldersandfiles.repositories.UserRepository;
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

    public DataLoader() {}

    public void run(ApplicationArguments args) {
        User mike = new User("Mike");
        userRepository.save(mike);
        User susan = new User("Susan");
        userRepository.save(susan);
        User jo = new User("Jo");
        userRepository.save(jo);

        Folder artStuff = new Folder("Art Stuff", mike);
        folderRepository.save(artStuff);
        Folder history = new Folder("History", mike);
        folderRepository.save(history);
        Folder movieStuff = new Folder("Movie Stuff", susan);
        folderRepository.save(movieStuff);
        Folder businessStuff = new Folder("Business Stuff", jo);
        folderRepository.save(businessStuff);

        File brushes = new File("Brushes", ".jpeg", 53, artStuff);
        fileRepository.save(brushes);
        File paints = new File("Paints", ".txt", 40, artStuff);
        fileRepository.save(paints);
        File ww2 = new File("World War Two", ".java", 5300, history);
        fileRepository.save(ww2);
        File blackDynamite = new File("Black Dynamite", ".mp4", 2048, movieStuff);
        fileRepository.save(blackDynamite);
        File money = new File("Money", ".txt", 3, businessStuff);
        fileRepository.save(money);
    }
}
