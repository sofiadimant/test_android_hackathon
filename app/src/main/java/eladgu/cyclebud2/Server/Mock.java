package eladgu.cyclebud2.Server;

import eladgu.cyclebud2.module.Request;
import eladgu.cyclebud2.module.RoadEvent;

public class Mock {

    public static String roadEventsMock (){
        /*
        ArrayList<RoadEvent> arr = new ArrayList<RoadEvent>();
        RoadEvent r= new RoadEvent();
        r.setLat(32.077763);
        r.setLng(34.786479);
        r.setDescription("police");
        r.setType(1);
        arr.add(r);

        RoadEvent r2= new RoadEvent();
        r2.setLat(32.077744);
        r2.setLng(32.077744);
        r2.setDescription("puddle");
        r2.setType(2);
        arr.add(r2);

        RoadEvent r3= new RoadEvent();
        r3.setLat(32.077755);
        r3.setLng(34.786455);
        r3.setDescription("broken traffic light");
        r3.setType(3);
        arr.add(r3);
*/

        return "\n" +
                "\t{\n" +
                " \t \"lat\": 32.077763,\n" +
                "  \t \"lng\": 34.786479,\n" +
                "         \"type\": 1,\n" +
                "         \"description\": \"police\"\n" +
                "        }\n" +
                "\t\n" +
                "\t{\n" +
                " \t \"lat\": 32.077744,\n" +
                "  \t \"lng\": 34.786455,\n" +
                "         \"type\": 2,\n" +
                "         \"description\": \"puddle\"\n" +
                "        }\n" +
                "\t{\n" +
                " \t \"lat\": 32.077755,\n" +
                "  \t \"lng\": 34.786455,\n" +
                "         \"type\": 2,\n" +
                "         \"description\": \"broken traffic light\"\n" +
                "        }\n" +
                "\n";
    }


}
