package eladgu.cyclebud2.utills;

import eladgu.cyclebud2.module.Request;
import eladgu.cyclebud2.module.RoadEvent;
import eladgu.cyclebud2.module.User;
import com.google.gson.Gson;

public class ConvertUtills {

    public static User ConvertToUser (String json){

        return new Gson().fromJson(json,User.class);
    }

    public static Request ConvertToReqest (String json){

        return new Gson().fromJson(json,Request.class);
    }

    public static RoadEvent ConvertToRoadEvent (String json){

        return new Gson().fromJson(json, RoadEvent.class);
    }

}
