package team2.test.food;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Schema(description = "음식 정보 등록 요청 DTO")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Getter
public class FoodRequestDto {
  @Schema(description = "음식 이름")
  private String foodName;

  @Schema(description = "음식 설명")
  private String description;

  @Schema(description = "음식 가격")
  private Integer price;

  public FoodEntity toEntity() {
    return FoodEntity.of(foodName, description, price);
  }
}
