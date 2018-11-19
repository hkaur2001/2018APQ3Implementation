public class CodeWordRunner
{
    public static void main(String[] args) {
        StringChecker sc1 = new CodeWordChecker();
        StringChecker sc2 = new CodeWordChecker();

        System.out.println(sc1.isValid());
        System.out.println(sc1.isValid());
        System.out.println(sc1.isValid());
        System.out.println(sc1.isValid());

        System.out.println(sc2.isValid());
        System.out.println(sc2.isValid());

    }

}