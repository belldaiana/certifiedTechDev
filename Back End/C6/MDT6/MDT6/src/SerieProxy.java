public class SerieProxy implements ISerie{

    private int cantidadVistas;
    private Serie serie;

    public SerieProxy(Serie serie) {
        this.serie = serie;
        this.cantidadVistas = 0;
    }

    @Override
    public String getSerie(String serie) throws SerieNoHabilitadaException{
        if(this.cantidadVistas >= 5){
            throw new SerieNoHabilitadaException("Ha superado la cantidad de reproducciones permitidas.");
        }
        this.cantidadVistas++;
        return this.serie.getSerie(serie);
    }

    public int getCantidadVistas() {
        return cantidadVistas;
    }
}
