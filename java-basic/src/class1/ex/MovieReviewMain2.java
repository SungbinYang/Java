package class1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        // 영화 정보 리뷰 선언
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한루프";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";

        MovieReview[] movieReviews = {movieReview1, movieReview2};

        // 영화 리뷰 정보 출력
        for (MovieReview movieReview : movieReviews) {
            System.out.println("영화 제목: " + movieReview.title + ", 리뷰: " + movieReview.review);
        }

    }
}
