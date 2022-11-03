package teamproject.capstone.recipe.entity.api;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class OpenAPIEntity {
    @Id
    private Long rcpSeq;
    @Column
    private String rcpNm;
    @Column
    private String rcpPat2;
    @Column
    private String rcpWay2;
    @Column
    private String rcpPartsDtls;
    @Column
    private String hashTag;
    @Column
    private String infoFat;
    @Column
    private String infoEng;
    @Column
    private String infoCar;
    @Column
    private String infoPro;
    @Column
    private String infoWgt;
    @Column
    private String infoNa;
    @Column
    private String attFileNoMk;
    @Column
    private String attFileNoMain;
    @Column
    private String manual01;
    @Column
    private String manual02;
    @Column
    private String manual03;
    @Column
    private String manual04;
    @Column
    private String manual05;
    @Column
    private String manual06;
    @Column
    private String manual07;
    @Column
    private String manual08;
    @Column
    private String manual09;
    @Column
    private String manual10;
    @Column
    private String manual11;
    @Column
    private String manual12;
    @Column
    private String manual13;
    @Column
    private String manual14;
    @Column
    private String manual15;
    @Column
    private String manual16;
    @Column
    private String manual17;
    @Column
    private String manual18;
    @Column
    private String manual19;
    @Column
    private String manual20;
    @Column
    private String manualImg01;
    @Column
    private String manualImg02;
    @Column
    private String manualImg03;
    @Column
    private String manualImg04;
    @Column
    private String manualImg05;
    @Column
    private String manualImg06;
    @Column
    private String manualImg07;
    @Column
    private String manualImg08;
    @Column
    private String manualImg09;
    @Column
    private String manualImg10;
    @Column
    private String manualImg11;
    @Column
    private String manualImg12;
    @Column
    private String manualImg13;
    @Column
    private String manualImg14;
    @Column
    private String manualImg15;
    @Column
    private String manualImg16;
    @Column
    private String manualImg17;
    @Column
    private String manualImg18;
    @Column
    private String manualImg19;
    @Column
    private String manualImg20;
}
