package id.sch.smktelkom_mlg.www.actors_prishe;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ActorsService {
    @GET("/JSONParsingTutorial/jsonActors")
    Call<ActorsService> getActors();
}
