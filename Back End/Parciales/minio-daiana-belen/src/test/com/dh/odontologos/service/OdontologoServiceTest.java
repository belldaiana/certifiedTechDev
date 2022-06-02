package test.com.dh.odontologos.service;

import com.dh.odontologos.dao.imp.OdontologoDaoH2;
import com.dh.odontologos.model.Odontologo;
import com.dh.odontologos.service.OdontologoService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;

import java.util.List;
import java.util.logging.Logger;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnit4.class)

public class OdontologoServiceTest {
    private static OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @BeforeClass
    public static void cargarDataSet() {
        Odontologo odontologo = odontologoService.guardar(new Odontologo("AC789456","Roberto", "Gomez"));
        Odontologo odontologo1 = odontologoService.guardar(new Odontologo("AA123456","Marta", "Lopez"));
    }

    @Test
    public void traerTodos() {
        List<Odontologo> odontologos = odontologoService.buscarTodos();
        Assert.assertTrue(!odontologos.isEmpty());
        Assert.assertTrue(odontologos.size() > 0);
        System.out.println(odontologos);
    }
}
