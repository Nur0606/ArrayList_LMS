package ArrayTask.service.impl;

import ArrayTask.db.Database;
import ArrayTask.enums.Gender;
import ArrayTask.gereric.GenericId;
import ArrayTask.model.Reader;
import ArrayTask.service.RaderService;

import java.util.List;
import java.util.Scanner;


public class ReaderServiceImpl  implements RaderService {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void save(Reader reader) {
        Database.getReaders.add(reader);
        System.out.println("✅");
    }

    @Override
    public List<Reader> getAllReaders() {
        return Database.getReaders;
    }

    @Override
    public Reader getREaderById(Long id) {
        for (Reader reader : Database.getReaders){
            if (reader.getId().equals(id)){
                return reader;
            }else
                System.out.println("Not-Found!");
        }
        return null;
    }

    @Override
    public Reader updateReader(Long id, Reader reader) {
        for (Reader reader1 :Database.getReaders){
            if (reader1.getId().equals(id)){
                reader.setId(GenericId.genericreaderId());
                System.out.println("Enter new Full Name: ");
                String name = scanner.next();
                reader.setFullName(name);
                System.out.println("Enter new E-mail: ");
                String email = scanner.next();
                reader.setEmail(email);
                System.out.println("Enter new Gender:(Male/Female)");
                Gender gender = Gender.valueOf(scanner.next());
                reader.setGender(gender);
                System.out.println("Enter new Phone number: (+996)");
                String ph = scanner.next();
                reader.setPhoneNumber(ph);
                Database.getReaders.remove(reader1);
                Database.getReaders.add(reader);
                return reader;
            }else
                System.out.println("Not-Found!");
        }
        return null;
    }

    @Override
    public void assingReaderToLibrary(Long readerId, Long libraryId) {
//        for (Library getLibrary : Database.getLibraries) {
//            if (getLibrary.getId().equals(libraryId)){
//                for (Reader reader :getLibrary.getReaders()){
//            }
//
//        }
    }
}
