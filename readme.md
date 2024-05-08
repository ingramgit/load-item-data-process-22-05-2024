# Load item data Workflow Process 

Workflow process calls kafka API to load the item data. The workflow process has single task to call kafka API. 

Once you have deployed load-item-data-process_1.0.0 workflow on Kie-server, then it can be accessed through below Kie-server REST API. We can test this API using below payload.

# URI: 
    http://<ip>/kie-server/services/rest/server/containers/{MyContainer}/processes/{ProcessId}/instances
# Method: 
    POST
# Path Param: 
    You need to pass deployed container id in {MyContainer} placeholder
    And Each container can have n number of workflow processes. Each workflow has unique process id 
    To call appropriate workflow process, need to pass process id in {ProcessId} placeholder
    Example: in our case deployed container id is 'load-item-data-process_1.0.0' and process id is 'loadItemDataProcess', so
    http://<ip>/kie-server/services/rest/server/containers/load-item-data-process_1.0.0/processes/loadItemDataProcess/instances
# Headers: 
    Content-Type: application/json
    Authorization: Basic ************

# Request Payload:       
    {
        "kafkaRequest": {
            "kafka_key": "dataverse_kafka_producer",
            "topic": "Action",
            "message": {
                "key": "LoadItemData",
                "message": "Run Item Data Load"
            }
        }
    }    

# Response Payload:
    2