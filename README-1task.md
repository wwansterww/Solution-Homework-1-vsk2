This project is my implementation of | the Proxy pattern |

##--------------------------------------------------------------------------------------------

| In this project I create several classes |

1. **RealImage** - a real image that loads when it is needed.
2. **ProxyImage** - a proxy object that first shows a reduced version of the image (thumbnail), and loads the full image only on request.
3. **AuthenticatedProxyImage** a secure proxy that checks if the user is authorized before showing the image.

##---------------------------------------------------------------------------------------------

There were some problems during development, but I was able to solve them

1. **Error with image loading**: At the beginning, I organized the image loading incorrectly. The proxy should have shown the thumbnail first, and the full image only on request. I was forgetting to upload a thumbnail first and only upload the full image when needed.

2. **Authentication Issues**: While working with **AuthenticatedProxyImage** I had to think about how to properly implement the authorization check. At first I did the authorization check in one place, but it was not flexible enough.
