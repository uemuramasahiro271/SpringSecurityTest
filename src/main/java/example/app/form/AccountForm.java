package example.app.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class AccountForm implements Serializable {

	private static final long serialVersionUID = 1;

	private String userName;
}
