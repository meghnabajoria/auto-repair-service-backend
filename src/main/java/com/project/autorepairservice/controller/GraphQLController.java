//package com.project.autorepairservice.controller;
//
//import graphql.ExecutionInput;
//import graphql.ExecutionResult;
//import graphql.GraphQL;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class GraphQLController {
//    private final GraphQL graphQL;
//
//    @Autowired
//    public GraphQLController(GraphQL graphQL) {
//        this.graphQL = graphQL;
//    }
//
//    @GetMapping
//    public ExecutionResult executeQueryGET(@RequestParam("query") String query) {
//        return executeGraphQLQuery(query);
//    }
//
//    private ExecutionResult executeGraphQLQuery(String query) {
//        ExecutionInput executionInput = ExecutionInput.newExecutionInput()
//                .query(query)
//                .build();
//        return graphQL.execute(executionInput);
//    }
//}
