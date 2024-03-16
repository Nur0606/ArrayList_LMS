package ArrayTask.service;

import ArrayTask.model.Library;

import java.util.List;

public interface LibraryService {
    List<Library> saveLibrary(Library libraries);
    List<Library> getAllLibraries();
    Library getLibraryById(Long id );
    Library updateLibrary(Long id , Library library);
    String deleteLibrary(Long id );
}
