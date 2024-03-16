package ArrayTask.gereric;

public class GenericId {
    public static Long bookId = 0L;
    public static Long libraryId = 0L;
    public static Long readerId = 0L;
    public static long genericBookId(){
        return ++bookId;
    }
    public static long genericlibraryId(){
        return ++libraryId;
    }

    public static long genericreaderId(){
        return ++readerId;
    }
}
