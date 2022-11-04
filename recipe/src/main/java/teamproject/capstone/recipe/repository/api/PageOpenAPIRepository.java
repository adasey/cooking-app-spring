package teamproject.capstone.recipe.repository.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import teamproject.capstone.recipe.entity.api.OpenRecipeEntity;

public interface PageOpenAPIRepository {
    Page<OpenRecipeEntity> openAPIPageHandling(Pageable pageable);
}
