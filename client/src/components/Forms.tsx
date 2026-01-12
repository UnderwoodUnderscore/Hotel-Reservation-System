import Field from './Fields';

export default function Form({ type }) {

    const loginForm = (
        <form id='loginForm'>
            <i className='fa-solid fa-house'></i>
            <h1 className='loginTitle'>Sign in to Hotel Suites</h1>

            <label htmlFor='username'>Username</label>
            <input name='username' type='text'></input>

            <label htmlFor='password'>Password</label>
            <input name='password' type='password'></input>

            <button type='submit'>Sign in</button>
        </form>
    )

    const bookingForm = (
        <form id='bookingForm'>
            <img src='https://picsum.photos/1400/900' alt='random image' />

            <Field type='date' text='Check In' />
            <Field type='date' text='Check Out' />
            <Field type='place' text='Place' />
            <Field type='number' text='People' />
        </form>
    );

    return (
        <>
            { type === 'login' && loginForm }
            { type === 'booking' && bookingForm }
        </>
    )
}