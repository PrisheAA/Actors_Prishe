package id.sch.smktelkom_mlg.www.actors_prishe;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ActorsResponse {

    @SerializedName("actors")
    private List<ActorsItem> actors;

    public List<ActorsItem> getActors() {
        return actors;
    }

    public void setActors(List<ActorsItem> actors) {
        this.actors = actors;
    }
}