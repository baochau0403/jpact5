package jpact5.dao;

import java.util.List;

import jpact5.entity.Video;

public interface IVideoDao {


	void insert (Video video);
	void update (Video video);
	void delete (int videoid) throws Exception;
	Video findById (int videoid);
	List<Video> findAll();
	List<Video> findByVideoname (String videoame);
	List<Video> findAll(int page, int pagesize);
	int count();
}
