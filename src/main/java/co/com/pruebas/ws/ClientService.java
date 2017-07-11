package co.com.pruebas.ws;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

import co.com.pruebas.model.Empleado;

public class ClientService {

	private static final String URL = "http://localhost:8080/Server/serviceRest/Search/Empleados";

	public List<Empleado> getEmpleadosAll() {
		List<Empleado> empleados = null;
		try {

			Client client = Client.create();

			WebResource webResource = client.resource(URL);

			ClientResponse response = webResource.type("application/json").post(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			System.out.println("Output from Server .... \n");
			Gson gson = new Gson();
			String output = response.getEntity(String.class);
			Type listType = new TypeToken<ArrayList<Empleado>>(){}.getType();
			empleados = gson.fromJson(output, listType);
			
			System.out.println(output);

		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("Ha ocurrido un error... ");
		}
		
		return empleados;

	}

}
