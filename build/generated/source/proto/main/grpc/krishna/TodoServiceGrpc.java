package krishna;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.1)",
    comments = "Source: grpcproject.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TodoServiceGrpc {

  private TodoServiceGrpc() {}

  public static final String SERVICE_NAME = "krishna.TodoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<krishna.CreateTodoRequest,
      krishna.Todo> getCreateTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTodo",
      requestType = krishna.CreateTodoRequest.class,
      responseType = krishna.Todo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<krishna.CreateTodoRequest,
      krishna.Todo> getCreateTodoMethod() {
    io.grpc.MethodDescriptor<krishna.CreateTodoRequest, krishna.Todo> getCreateTodoMethod;
    if ((getCreateTodoMethod = TodoServiceGrpc.getCreateTodoMethod) == null) {
      synchronized (TodoServiceGrpc.class) {
        if ((getCreateTodoMethod = TodoServiceGrpc.getCreateTodoMethod) == null) {
          TodoServiceGrpc.getCreateTodoMethod = getCreateTodoMethod =
              io.grpc.MethodDescriptor.<krishna.CreateTodoRequest, krishna.Todo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  krishna.CreateTodoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  krishna.Todo.getDefaultInstance()))
              .setSchemaDescriptor(new TodoServiceMethodDescriptorSupplier("createTodo"))
              .build();
        }
      }
    }
    return getCreateTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<krishna.GetTodoRequest,
      krishna.Todo> getGetTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTodo",
      requestType = krishna.GetTodoRequest.class,
      responseType = krishna.Todo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<krishna.GetTodoRequest,
      krishna.Todo> getGetTodoMethod() {
    io.grpc.MethodDescriptor<krishna.GetTodoRequest, krishna.Todo> getGetTodoMethod;
    if ((getGetTodoMethod = TodoServiceGrpc.getGetTodoMethod) == null) {
      synchronized (TodoServiceGrpc.class) {
        if ((getGetTodoMethod = TodoServiceGrpc.getGetTodoMethod) == null) {
          TodoServiceGrpc.getGetTodoMethod = getGetTodoMethod =
              io.grpc.MethodDescriptor.<krishna.GetTodoRequest, krishna.Todo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  krishna.GetTodoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  krishna.Todo.getDefaultInstance()))
              .setSchemaDescriptor(new TodoServiceMethodDescriptorSupplier("getTodo"))
              .build();
        }
      }
    }
    return getGetTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<krishna.UpdateTodoRequest,
      krishna.Todo> getUpdateTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateTodo",
      requestType = krishna.UpdateTodoRequest.class,
      responseType = krishna.Todo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<krishna.UpdateTodoRequest,
      krishna.Todo> getUpdateTodoMethod() {
    io.grpc.MethodDescriptor<krishna.UpdateTodoRequest, krishna.Todo> getUpdateTodoMethod;
    if ((getUpdateTodoMethod = TodoServiceGrpc.getUpdateTodoMethod) == null) {
      synchronized (TodoServiceGrpc.class) {
        if ((getUpdateTodoMethod = TodoServiceGrpc.getUpdateTodoMethod) == null) {
          TodoServiceGrpc.getUpdateTodoMethod = getUpdateTodoMethod =
              io.grpc.MethodDescriptor.<krishna.UpdateTodoRequest, krishna.Todo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  krishna.UpdateTodoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  krishna.Todo.getDefaultInstance()))
              .setSchemaDescriptor(new TodoServiceMethodDescriptorSupplier("updateTodo"))
              .build();
        }
      }
    }
    return getUpdateTodoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<krishna.DeleteTodoRequest,
      krishna.DeleteTodoResponse> getDeleteTodoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteTodo",
      requestType = krishna.DeleteTodoRequest.class,
      responseType = krishna.DeleteTodoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<krishna.DeleteTodoRequest,
      krishna.DeleteTodoResponse> getDeleteTodoMethod() {
    io.grpc.MethodDescriptor<krishna.DeleteTodoRequest, krishna.DeleteTodoResponse> getDeleteTodoMethod;
    if ((getDeleteTodoMethod = TodoServiceGrpc.getDeleteTodoMethod) == null) {
      synchronized (TodoServiceGrpc.class) {
        if ((getDeleteTodoMethod = TodoServiceGrpc.getDeleteTodoMethod) == null) {
          TodoServiceGrpc.getDeleteTodoMethod = getDeleteTodoMethod =
              io.grpc.MethodDescriptor.<krishna.DeleteTodoRequest, krishna.DeleteTodoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteTodo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  krishna.DeleteTodoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  krishna.DeleteTodoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TodoServiceMethodDescriptorSupplier("deleteTodo"))
              .build();
        }
      }
    }
    return getDeleteTodoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TodoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TodoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TodoServiceStub>() {
        @java.lang.Override
        public TodoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TodoServiceStub(channel, callOptions);
        }
      };
    return TodoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TodoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TodoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TodoServiceBlockingStub>() {
        @java.lang.Override
        public TodoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TodoServiceBlockingStub(channel, callOptions);
        }
      };
    return TodoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TodoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TodoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TodoServiceFutureStub>() {
        @java.lang.Override
        public TodoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TodoServiceFutureStub(channel, callOptions);
        }
      };
    return TodoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createTodo(krishna.CreateTodoRequest request,
        io.grpc.stub.StreamObserver<krishna.Todo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTodoMethod(), responseObserver);
    }

    /**
     */
    default void getTodo(krishna.GetTodoRequest request,
        io.grpc.stub.StreamObserver<krishna.Todo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTodoMethod(), responseObserver);
    }

    /**
     */
    default void updateTodo(krishna.UpdateTodoRequest request,
        io.grpc.stub.StreamObserver<krishna.Todo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTodoMethod(), responseObserver);
    }

    /**
     */
    default void deleteTodo(krishna.DeleteTodoRequest request,
        io.grpc.stub.StreamObserver<krishna.DeleteTodoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTodoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service TodoService.
   */
  public static abstract class TodoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TodoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service TodoService.
   */
  public static final class TodoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<TodoServiceStub> {
    private TodoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TodoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TodoServiceStub(channel, callOptions);
    }

    /**
     */
    public void createTodo(krishna.CreateTodoRequest request,
        io.grpc.stub.StreamObserver<krishna.Todo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTodo(krishna.GetTodoRequest request,
        io.grpc.stub.StreamObserver<krishna.Todo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTodo(krishna.UpdateTodoRequest request,
        io.grpc.stub.StreamObserver<krishna.Todo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTodoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTodo(krishna.DeleteTodoRequest request,
        io.grpc.stub.StreamObserver<krishna.DeleteTodoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTodoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service TodoService.
   */
  public static final class TodoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TodoServiceBlockingStub> {
    private TodoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TodoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TodoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public krishna.Todo createTodo(krishna.CreateTodoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public krishna.Todo getTodo(krishna.GetTodoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public krishna.Todo updateTodo(krishna.UpdateTodoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTodoMethod(), getCallOptions(), request);
    }

    /**
     */
    public krishna.DeleteTodoResponse deleteTodo(krishna.DeleteTodoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTodoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service TodoService.
   */
  public static final class TodoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<TodoServiceFutureStub> {
    private TodoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TodoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TodoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<krishna.Todo> createTodo(
        krishna.CreateTodoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTodoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<krishna.Todo> getTodo(
        krishna.GetTodoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTodoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<krishna.Todo> updateTodo(
        krishna.UpdateTodoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTodoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<krishna.DeleteTodoResponse> deleteTodo(
        krishna.DeleteTodoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTodoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TODO = 0;
  private static final int METHODID_GET_TODO = 1;
  private static final int METHODID_UPDATE_TODO = 2;
  private static final int METHODID_DELETE_TODO = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TODO:
          serviceImpl.createTodo((krishna.CreateTodoRequest) request,
              (io.grpc.stub.StreamObserver<krishna.Todo>) responseObserver);
          break;
        case METHODID_GET_TODO:
          serviceImpl.getTodo((krishna.GetTodoRequest) request,
              (io.grpc.stub.StreamObserver<krishna.Todo>) responseObserver);
          break;
        case METHODID_UPDATE_TODO:
          serviceImpl.updateTodo((krishna.UpdateTodoRequest) request,
              (io.grpc.stub.StreamObserver<krishna.Todo>) responseObserver);
          break;
        case METHODID_DELETE_TODO:
          serviceImpl.deleteTodo((krishna.DeleteTodoRequest) request,
              (io.grpc.stub.StreamObserver<krishna.DeleteTodoResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateTodoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              krishna.CreateTodoRequest,
              krishna.Todo>(
                service, METHODID_CREATE_TODO)))
        .addMethod(
          getGetTodoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              krishna.GetTodoRequest,
              krishna.Todo>(
                service, METHODID_GET_TODO)))
        .addMethod(
          getUpdateTodoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              krishna.UpdateTodoRequest,
              krishna.Todo>(
                service, METHODID_UPDATE_TODO)))
        .addMethod(
          getDeleteTodoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              krishna.DeleteTodoRequest,
              krishna.DeleteTodoResponse>(
                service, METHODID_DELETE_TODO)))
        .build();
  }

  private static abstract class TodoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TodoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return krishna.Grpcproject.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TodoService");
    }
  }

  private static final class TodoServiceFileDescriptorSupplier
      extends TodoServiceBaseDescriptorSupplier {
    TodoServiceFileDescriptorSupplier() {}
  }

  private static final class TodoServiceMethodDescriptorSupplier
      extends TodoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TodoServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TodoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TodoServiceFileDescriptorSupplier())
              .addMethod(getCreateTodoMethod())
              .addMethod(getGetTodoMethod())
              .addMethod(getUpdateTodoMethod())
              .addMethod(getDeleteTodoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
