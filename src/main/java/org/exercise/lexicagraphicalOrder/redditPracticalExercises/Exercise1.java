package org.exercise.lexicagraphicalOrder.redditPracticalExercises;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Calculate total amount of bank records for different users.
 * Bank records information is provided as a .json file.
 */
public class Exercise1 {


    public static void main(String[] args) {
        int acumSalary = 0;
        int totalAmount = 0;

        try {
            String root = System.getProperty("user.dir");

            // Ruta del archivo JSON
            String filePath = root + "/src/main/java/org/exercise/lexicagraphicalOrder/redditPracticalExercises/user.json";

            // Crear un ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();

            // Leer el archivo JSON como un JsonNode
            JsonNode rootNode = objectMapper.readTree(new File(filePath));

            // Iterar sobre la lista de usuarios
            for (JsonNode userNode : rootNode.path("users")) {
                // Obtener el nombre y el salario de cada usuario
                String nombre = userNode.path("name").asText();

                // Iterar sobre los registros bancarios del usuario
                for (JsonNode recordNode : userNode.path("bankRecords")) {
                    // Obtener el monto del registro y sumarlo al total
                    int amount = recordNode.path("amount").asInt();
                    totalAmount += amount;

                }

                System.out.println("The total amount for user " + nombre + ", es de: $" + totalAmount);
                totalAmount = 0;

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
