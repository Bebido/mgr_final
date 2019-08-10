public class ResultAnswer {

    String type;
    Long yesAnswers = 0L;
    Long noAnswers = 0L;
    Long naAnswers = 0L;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getYesAnswers() {
        return yesAnswers;
    }

    public void setYesAnswers(Long yesAnswers) {
        this.yesAnswers = yesAnswers;
    }

    public Long getNoAnswers() {
        return noAnswers;
    }

    public void setNoAnswers(Long noAnswers) {
        this.noAnswers = noAnswers;
    }

    public Long getNaAnswers() {
        return naAnswers;
    }

    public void setNaAnswers(Long naAnswers) {
        this.naAnswers = naAnswers;
    }
}
