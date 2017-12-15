#!groovy

@Library('MicroserviceBuilder') _
microserviceBuilderPipeline{
	image = 'ht2017team8-portal:0.0.003'
	registry = '172.16.100.16:5005/guanxiaokang/'
	namespace = 'team8'
	mvnCommands = '-Picp -Dmaven.test.skip=true clean package '
}
