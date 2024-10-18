package com.example.demo.model;

import java.io.InputStream;
import java.util.Iterator;

import org.h2.result.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.example.demo.repository.AreaRepository;
import com.example.demo.repository.CargoRepository;
import com.example.demo.repository.IdeaRepository;
import com.example.demo.repository.RegionalRepository;

public class DataBaseInit implements ApplicationRunner {

    @Autowired
    private AreaRepository areaRepository;

    @Autowired
    private CargoRepository cargoRepository;

    @Autowired
    private IdeaRepository ideaRepository;

    @Autowired
    private RegionalRepository regionalRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        // Ruta al archivo Excel
                InputStream inputStream = getClass().getResourceAsStream("/static/excel/MEDICAMENTOS_VETERINARIA.xlsx");

                // Leer el archivo Excel
                Workbook workbook = new XSSFWorkbook(inputStream);
                Sheet sheet = workbook.getSheetAt(0); // Leer la primera hoja

                // Iterar sobre las filas del archivo
                Iterator<org.apache.poi.ss.usermodel.Row> rows = sheet.iterator();

                // while (rows.hasNext()) {
                //         Row row = rows.next();

                //         // Suponiendo que la primera fila contiene encabezados
                //         if (row.getRowNum() == 0) {
                //                 continue; // Omitir encabezados
                //         }

                //         // Suponiendo que el archivo tiene las columnas: nombre, dosis, descripción,
                //         // etc.
                //         String nombre = row.getCell(0).getStringCellValue();
                //         double precioVenta = row.getCell(1).getNumericCellValue();
                //         double precioCompra = row.getCell(2).getNumericCellValue();
                //         int unidadesDisponibles = (int) row.getCell(3).getNumericCellValue();
                //         int unidadesVendidas = (int) row.getCell(4).getNumericCellValue();
                //         // Otros campos que puedas tener...

                //         // Crear una nueva instancia de Droga
                //         Droga droga = new Droga();
                //         droga.setNombre(nombre);
                //         droga.setPrecioVenta(precioVenta);
                //         droga.setPrecioCompra(precioCompra);
                //         droga.setUnidadesDisponibles(unidadesDisponibles);
                //         droga.setUnidadesVendidas(unidadesVendidas);
                //         // Asignar otros campos...

                //         // Guardar el medicamento en la base de datos
                //         droga_repo.save(droga);
                // }

                // // Cerrar el workbook y el InputStream
                // workbook.close();
                // inputStream.close();

    }
}
