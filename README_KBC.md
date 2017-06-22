# ICE Portal extractor
ICE Portal extractor docker component for Keboola Connection.
## Functionality
Component enables retrieving visual content data from Iceportal services.
## Configuration
### Parameters

 - **User Name** – *(REQ)* Your ICE Portal account user name
 - **Password**– *(REQ)* Your ICE Portal account password
 - **User Mtype** – *(REQ)* Your ICE Portal mapping type ID
 - **Property types** – select required property types. Default value is All.
 - **Publication status** – Only return properties with given publication status. Allowed values are All, Published and Unpublished.
 - **Changed since** – Date string in a format `YYYY-MM-DD`. Only properties that has changed since this date will be retrieved. Leave this value blank if you wish to perform an initial load and retrieve all data available. **NOTE:** If this value is specified properties that has changed since this date will be downloaded each run, regardless of last run. Which means a full load will be performed each time. This option is only recommended when you wish to make a single load in specific period or if you wish to use the `Full Storage upload mode`. In most scenarios it is better to leave this option blank. For more info, see `Usage` section below.
 - **Storage upload mode** – (*DEFAULT* `INCREMENTAL`) specifies whether to upload incrementally. If set to `INCREMENTAL`, the primary keys must be specified.

## Usage
Most common scenario is to leave all parameters set to default values.

![Common config](/imgs/config.png)
 
In this case, all available properties and corresponding visual data will be retrieved on the first run. Each consequent run, only properties that have changed since the last run will be retrieved. It is important to set the Storage upload mode to Incremental, otherwise all data from previous load will be overwritten in the output bucket.
