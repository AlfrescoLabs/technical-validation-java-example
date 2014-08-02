# technical-validation-java-example

An example Java program that shows how to call the [Alfresco Validation Tool](https://github.com/AlfrescoLabs/technical-validation)
programmatically.

## Installation

Clone this project to a local working copy.

## Configuration

Ensure the pre-requisities for the [Alfresco Validation Tool](https://github.com/AlfrescoLabs/technical-validation)
are met - in particulary, carefully review the [Dependencies](https://github.com/AlfrescoLabs/technical-validation#dependencies)
and [Configuration](https://github.com/AlfrescoLabs/technical-validation#configuration) sections.

Then:

1. Copy go.sh.sample to go.sh
2. Open go.sh in your favourite text editor
3. Modify the tunables at the top - note: _at least_ EXTENSION_DIR must be set

## Running
Ensure you have an extension, including both source _and_ binaries, saved in the directory you specified in step 3 above.
Run ```go.sh```.
Wait...
Wait some more...

Eventually you should see a large JSON result (the example dumps the raw validation results to JSON, though other code can
do whatever it wants with the data).
