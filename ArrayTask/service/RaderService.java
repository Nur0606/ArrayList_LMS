package ArrayTask.service;

import ArrayTask.model.Library;
import ArrayTask.model.Reader;

import java.util.List;

public interface RaderService {
    void save (Reader reader);
    List<Reader>getAllReaders();
    Reader  getREaderById(Long id );
    Reader updateReader(Long id ,  Reader reader);
    void assingReaderToLibrary(Long readerId , Long libraryId);
}
