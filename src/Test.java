public class Test {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        VeryStrictDiet veryStrictDiet = new VeryStrictDiet();
        veryStrictDiet.takeLunch(dayOfWeek);
    }
}
