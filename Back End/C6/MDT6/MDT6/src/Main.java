public class Main {
    public static void main(String[] args) throws SerieNoHabilitadaException{
        Serie Dark = new Serie();
        ISerie proxySerie = new SerieProxy(Dark);
        System.out.println(proxySerie.getSerie("Dark"));

        Serie Ozark = new Serie();
        ISerie proxySerie1 = new SerieProxy(Ozark);
        System.out.println(proxySerie1.getSerie("Ozark"));
        System.out.println(proxySerie1.getSerie("Ozark"));
        System.out.println(proxySerie1.getSerie("Ozark"));
        System.out.println(proxySerie1.getSerie("Ozark"));
        System.out.println(proxySerie1.getSerie("Ozark"));
        System.out.println(proxySerie1.getSerie("Ozark"));

    }
}
