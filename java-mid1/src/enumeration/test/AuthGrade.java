package enumeration.test;

public enum AuthGrade {
    GUEST(1, "손님"),
    LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자");

    private final int level;

    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public static AuthGrade judgeGrade(String grade) {
        String newGrade = grade.toUpperCase();
        AuthGrade authGrade = valueOf(newGrade);

        System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");

        return authGrade;
    }
}
