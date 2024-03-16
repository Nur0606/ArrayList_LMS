package ArrayTask.service.impl;

import ArrayTask.db.Database;
import ArrayTask.gereric.GenericId;
import ArrayTask.model.Library;
import ArrayTask.service.LibraryService;

import java.util.List;
import java.util.Scanner;

public class LibraryServiceImpl implements LibraryService {
    Scanner scanner = new Scanner(System.in);
    @Override
    public List<Library> saveLibrary(Library libraries) {
        Database.getLibraries.add(libraries);
       return Database.getLibraries;
    }

    @Override
    public List<Library> getAllLibraries() {
        return Database.getLibraries;
    }

    @Override
    public Library getLibraryById(Long id) {
        for (Library getLibrary : Database.getLibraries) {
            if (getLibrary.getId().equals(id)) {
               return getLibrary;
            }else
                System.out.println("NeTu!");
        }
        return null ;
    }

    @Override
    public Library updateLibrary(Long id, Library library) {
        for (Library getLibrary : Database.getLibraries) {
            if (getLibrary.getId().equals(id)){
                library.setId(getLibrary.getId());
                System.out.println("Enter new Library name: ");
                String name = scanner.nextLine();
                library.setName(name);
                System.out.println("Enter new Library Address: ");
                String addres = scanner.nextLine();
                library.setAddress(addres);
                Database.getLibraries.remove(getLibrary);
                Database.getLibraries.add(library);
                return library;
            }else
                System.out.println("Ne naydeno!");

        }
        return null;
    }

    @Override
    public String deleteLibrary(Long id) {
        for (Library getLibrary : Database.getLibraries) {
            if (getLibrary.getId().equals(id)){
                Database.getLibraries.remove(getLibrary);
                return "✅";
            }else
                System.out.println("❌");

        }
        return null;
    }
}
