package form;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClassroomUpdateForm {
    private Integer id;

    private Integer totalMembers;
    private String teacher;
    private String moreInfomation;
    private String description;
    private Integer levelId;
}
