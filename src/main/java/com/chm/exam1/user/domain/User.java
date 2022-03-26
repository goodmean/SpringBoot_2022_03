package com.chm.exam1.user.domain;

import javax.persistence.Entity;
import java.time.LocalDateTime;

public class User {
	public long id;
	public LocalDateTime regDate;
	public LocalDateTime updateDate;
	public String email;
    public String password;
    public String name;
}
