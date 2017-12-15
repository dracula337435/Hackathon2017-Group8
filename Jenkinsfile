#!groovy

@Library('MicroserviceBuilder') _
microserviceBuilderPipeline{
	image = 'ht2017team8-portal'
	registry = '172.16.100.16:5005/guanxiaokang/'
	namespace = 'team8'
	mvnCommands = '-Picp -Dmaven.test.skip=true clean package '
}
