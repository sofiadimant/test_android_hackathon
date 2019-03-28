package eladgu.cyclebud2.Server;

import eladgu.cyclebud2.module.Request;
import eladgu.cyclebud2.module.RoadEvent;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

public class RequestMenager {

    public ArrayList<RoadEvent> getEvent(Request request) {

        String json = Mock.roadEventsMock();

        RoadEvent roadEvent = new Gson().fromJson(json, RoadEvent.class);
        return new Gson().fromJson(json, new TypeToken<ArrayList<RoadEvent>>() {
        }.getType());
    }

}
