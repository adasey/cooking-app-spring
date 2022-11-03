package teamproject.capstone.recipe.util.api;

import java.net.URL;

class OpenAPI {
    private final URL APIUrl;

    OpenAPI(URL APIUrl) {
        this.APIUrl = APIUrl;
    }

    public URL getAPIUrl() {
        return APIUrl;
    }
}
