package CourseWork.First.Entitys;

public class CounterId {
    private static int id = 0;

    public static int getId(){
        int currentId = id;
        id++;
        return currentId;
    }
}
