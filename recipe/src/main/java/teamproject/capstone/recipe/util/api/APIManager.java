package teamproject.capstone.recipe.util.api;

import lombok.extern.slf4j.Slf4j;
import teamproject.capstone.recipe.util.api.values.ConstValues;

import java.net.MalformedURLException;
import java.net.URL;

@Slf4j
class APIManager {
    private API api;

    private URL requestOpenAPIJSON(int startIndex, int endIndex) throws MalformedURLException {
        return new URL(ConstValues.RECIPE_OPEN_API + "api/" + ConstValues.API_KEY +
                "COOKRCP01/json/" + startIndex + "/" + endIndex);
    }

    public void urlAvailability(int startIndex, int endIndex) {
        try {
            api = new API(requestOpenAPIJSON(startIndex, endIndex));
        } catch (MalformedURLException mal) {
            mal.printStackTrace();
            log.error("wrong url or wrong api key");
        }
    }

    public API getApi() {
        return api;
    }
}
