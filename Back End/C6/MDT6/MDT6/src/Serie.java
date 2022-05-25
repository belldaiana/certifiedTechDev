public class Serie implements ISerie{

    @Override
    public String getSerie(String serie) {
        return "www." + serie + ".com";
    }

}
