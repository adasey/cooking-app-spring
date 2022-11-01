package teamproject.capstone.recipe.util.api.values;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum APICode {
    INFO_000("INFO-000"),
    INFO_200("INFO-200"),
    ERROR_334("ERROR-334");

    private final String code;
}
