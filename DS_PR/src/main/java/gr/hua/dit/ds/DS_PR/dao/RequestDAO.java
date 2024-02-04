package gr.hua.dit.ds.DS_PR.dao;

import gr.hua.dit.ds.DS_PR.entity.Request;

import java.util.List;

public interface RequestDAO {

    public List<Request> getRequests();
    public Request getRequest(Integer request_id);
    public void saveRequest(Request request);
    public void deleteRequest(Integer request_id);

}