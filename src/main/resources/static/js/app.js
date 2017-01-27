var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
	    .when('/home',{
	        templateUrl: '/views/home.html',
	        controller: 'homeController'
	    })
        .when('/users',{
            templateUrl: '/views/users.html',
            controller: 'usersController'
        })
        .when('/roles',{
            templateUrl: '/views/roles.html',
            controller: 'rolesController'
        })
        .when('/form-professional',{
            templateUrl: '/views/form-professional.html',
            controller: 'formProfessionalController'
        })
        .when('/list-professional',{
            templateUrl: '/views/list-professional.html',
            controller: 'listProfessionalController'
        })
        .otherwise(
            { redirectTo: '/'}
        );
});

