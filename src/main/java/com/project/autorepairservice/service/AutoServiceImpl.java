//package com.project.autorepairservice.service;
//
//import com.project.autorepairservice.Models.ServiceModel;
//import com.project.autorepairservice.dto.request.ServiceRequest;
//import com.project.autorepairservice.dto.response.ServiceResponse;
//import com.project.autorepairservice.repository.ServiceRepository;
//import com.project.autorepairservice.service.helpers.ServiceException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//@Service
//public class  AutoServiceImpl implements AutoService{
//
//    @Autowired
//    ServiceRepository serviceRepository;
//    @Override
//    public String addService(ServiceRequest request) {
//        if (request.getName() == null ||
//                request.getName().isEmpty() ||
//                request.getDesc().isEmpty()) {
//            throw new ServiceException("Service name or description cannot be null");
//        }
//
//        ServiceModel serviceModel = ServiceModel
//                .builder()
//                .name(request.getName())
//                .serviceType(request.getServiceType())
//                .desc(request.getDesc())
//                .imgUrl(request.getImgUrl())
//                .offeredAtStores(request.getOfferedAtStores())
//                .build();
//
//        ServiceModel model = serviceRepository.insert(serviceModel);
//        return model.getId();
//    }
//
//
//    @Override
//    public List<ServiceResponse> findAll(){
//        List<ServiceModel> list = serviceRepository.findAll();
//        List<ServiceResponse> responseList = new ArrayList<>();
//        for(ServiceModel model: list) {
//            ServiceResponse s = ServiceResponse.builder()
//                    .name(model.getName())
//                    .desc(model.getDesc())
//                    .build();
//            responseList.add(s);
//        }
//        return responseList;
//    }
//}
