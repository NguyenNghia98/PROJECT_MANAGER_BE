package form;

import com.vti.entity.Classroom;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClassroomCreateForm {
    private String level;
    private Integer totalMembers;
    private String teacher;
    private String moreInfomation;
    private String description;
    private Integer levelId;
  
}
