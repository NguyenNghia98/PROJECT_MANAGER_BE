package form;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentUpdateForm {
    private Integer id;
    private String gmail;
    private String username;
    private String fullname;
    private String phonenumber;
    private Integer genderId;
    private Integer districsId;
}
