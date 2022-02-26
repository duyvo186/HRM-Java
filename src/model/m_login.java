package model;

//public class m_login {
//	private String username;
//	private String pw;
//
//	public m_login() {
//
//	}
//
//	public m_login(String username, String pw) {
//		super();
//		this.username = username;
//		this.pw = pw;
//
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getPw() {
//		return pw;
//	}
//
//	public void setPw(String pw) {
//		this.pw = pw;
//	}
//
//}
public class m_login{
    private int id;
    
    private String username;
    private String pw;
    private String name;
    private String date;
    private String ma;
    private String thongbao;
    public m_login() {
    }

    public m_login(int id, String username, String pw, String ma, String date,String name, String thongbao) {
        this.id = id;
        this.thongbao=thongbao;
        this.username = username;
        this.pw = pw;
        this.ma=ma;
        this.date=date;
        this.name=name;
        }

    public String getThongbao() {
		return thongbao;
	}

	public void setThongbao(String thongbao) {
		this.thongbao = thongbao;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getpw() {
        return pw;
    }

    public void setpw(String pw) {
        this.pw = pw;
    }
    
    
}

   
   

    