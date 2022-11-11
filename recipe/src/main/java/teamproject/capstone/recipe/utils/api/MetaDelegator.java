package teamproject.capstone.recipe.utils.api;

import teamproject.capstone.recipe.utils.api.json.Meta;
import teamproject.capstone.recipe.utils.values.TotalValue;

public class MetaDelegator {
    public static Meta metaGenerator(boolean isEnd, int pageCount, int pageTotalCount) {
        return Meta.builder()
                .end(isEnd)
                .pageable_count(pageCount)
                .total_count(pageTotalCount)
                .build();
    }
}
