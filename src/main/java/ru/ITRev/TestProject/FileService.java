package ru.ITRev.TestProject;

import org.springframework.web.multipart.MultipartFile;
import ru.ITRev.TestProject.model.ModelFile;

import java.io.IOException;
import java.util.List;

public interface FileService {
    ModelFile getFile(Long id);

    List<ModelFile> getAllFiles();

    void downloadFile(MultipartFile file) throws IOException;

    void updateFile();

    void deleteFile(Long id);

    List<ModelFile> getNameFiles();
}