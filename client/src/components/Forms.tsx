import Field from './Fields';

export default function Form({ type }) {

    const loginForm = (
        <form id='loginForm'>
            <i className='fa-solid fa-house'></i>
            <h1 className='loginTitle ta-center'>Sign in to Hotel Suites</h1>

            <label htmlFor='username'>Username</label>
            <input name='username' type='text'></input>

            <label htmlFor='password'>Password</label>
            <input name='password' type='password'></input>

            <button type='submit'>Sign in</button>
        </form>
    )

    const bookingForm = (
        <form id='bookingForm' className='ji-center'>
            <Field type='date' text='Check In' />
            <Field type='date' text='Check Out' />
            <Field type='people' text='People' />

            <button className='cursor-pointer' type='submit'>Find Bookings</button>
        </form>
    );

    return (
        <>
            { type === 'login' && loginForm }
            { type === 'booking' && bookingForm }
        </>
    )
}