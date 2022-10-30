package c;

import org.restlet.*;
import org.restlet.data.Protocol;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class FirstServerResource extends ServerResource {

    //private static int count = 0;
    private static String json_string;
    private static String score_string;

    public static void main(String[] args) throws Exception {

        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();

        Questions one_q = new Questions("How many members of the US Congress?", "435");
        Score one_s = new Score(1);

        json_string = gson.toJson(one_q);
        score_string = gson.toJson(one_s);


        // Create the HTTP server and listen on port 8182
        new Server(Protocol.HTTP, 8182, FirstServerResource.class).start();
    }


    @Get
    public String toString() {
        // count++;
        return  json_string;  // "Question " + Integer.valueOf(count).toString() + ": " +
    }

}
