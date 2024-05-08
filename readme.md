# Load item data Workflow Process 

Workflow process calls kafka API 

# Task 1 
    Call the business rule to find the day of the week based on the passed date
    
# Task 2 
    If given date is weekday, Call the data extractor Python API (with parameter) to pick the data from *data file* and wait for the response for completion of the task.                             

# Task 3 
    If given date is weekend, Call the data extractor Python API (with parameter) to pick the data from *database/MySQL* and wait for the response for completion of the task.                              
 
# Task 4 
    Call Producer API (to send metadata of the file created by the extractor to kafka) wait for the response. if completed, end the workflow process.

Once you have deployed item-master-data-process_1.0.0 workflow on Kie-server, then it can be accessed through below Kie-server REST API. We can test this API using below payload.

# URI: 
    http://<ip>/kie-server/services/rest/server/containers/{MyContainer}/processes/{ProcessId}/instances
# Method: 
    POST
# Path Param: 
    You need to pass deployed container id in {MyContainer} placeholder
    And Each container can have n number of workflow processes. Each workflow has unique process id 
    To call appropriate workflow process, need to pass process id in {ProcessId} placeholder
    Example: in our case deployed container id is 'item-master-data-process_1.0.0' and process id is 'itemMasterDataProcess', so
    http://<ip>/kie-server/services/rest/server/containers/item-master-data-process_1.0.0/processes/itemMasterDataProcess/instances
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